$(document).ready(function() {
	$('#title').attr('name', 'title-' + new Date().getTime());

	$('.add-content').click(function() {
	
		var $div = createDivision();
		var $textarea = document.createElement('textarea');
		$($textarea).attr({
			'name' : 'content-' + (new Date().getTime()),
			'placeholder' : '내용을 입력하세요.'
		});
		
		$($textarea).addClass("col s12 materialize-textarea validate center-align");
		$($div).append($textarea);
		addMouseHoverEventOnElement($div);
		$('.item-container').append($div);
	});

	$('.add-image').click(function(e) {
		e.preventDefault();

		var $div = createDivision();
		var $hiddenInput = document.createElement('input');
		$($hiddenInput).attr({
			'type' : 'file',
			'name' : 'image-' + (new Date().getTime()),
			'accept' : 'image/*',
			'hidden' : 'hidden', 'onchange' : 'getThumbnailPrivew(this)'
		});
		addMouseHoverEventOnElement($hiddenInput);
		$('.item-container').append($hiddenInput);
		$($hiddenInput).click();
	});

	$('.add-hr').click(function() {
		var $div = createDivision();
		var $hr = document.createElement('hr');
		var $hiddenInput = document.createElement('input');
		
		$($hr).addClass('col s8 offset-s2');
		$($hiddenInput).attr({
			'type' : 'text',
			'name' : 'line-'+ (new Date().getTime()),
			'hidden' : 'hidden'
		});

		$($hiddenInput).val('true');
		$($div).append($hiddenInput);
		$($div).append($hr);
		addMouseHoverEventOnElement($div);
		$('.item-container').append($div);
	});
});

function createDivision() {
	var $div = document.createElement('div');
	$($div).addClass('row item-wrapper');
	return $div;
};

function addMouseHoverEventOnElement(element) {
	var menu = addAndGetMenuTab($(element));
	$(element).on('mouseenter', function() {
		$(menu).css('opacity', '1');
	});

	$(element).on('mouseleave', function() {
		$(menu).css('opacity', '0');
	});
};

function addAndGetMenuTab(toAttachElement) {
	
	var $menu = document.createElement('button');
	$($menu).text('삭제');
	$($menu).addClass('menu-tab z-depth-3 col s1 offset-s10');
	$($menu).css({
		'position' : 'relative',
		'top' : '-40px'
	});
	$($menu).click(function() {
		$(toAttachElement).remove();
	});
	$(toAttachElement).append($menu);

	return $menu;
};

function getThumbnailPrivew(html) {
	var $preview = createDivision();

	addMouseHoverEventOnElement($preview);

	if (html.files && html.files[0]) {
		var reader = new FileReader();
		reader.onload = function(e) {
			$($preview).css('display', '');
			$($preview).append(
					'<img class="col s10 offset-s1 m6 offset-m3 l6 offset-l3 image-preview" src="'
							+ e.target.result
							+ '" border="0" height="235" alt="" />');
			$('.item-container').append($preview);
		}
		reader.readAsDataURL(html.files[0]);
	}
};

function uploadFile() {
	var form = $('#post-form')[0];
	var formData = new FormData(form);

	$.ajax({
		url : '/rest/post/upload',
		type : 'POST',
		processData : false,
		contentType : false,
		data : formData,
		success : function(result) {
			location.reload(true);
		},
		error : function(error) {
			Materialize.toast(error.responseJSON, 1000);
		}
	});
};