package com.encar.blog.domain;

import java.io.Reader;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import oracle.sql.CLOB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class CmMap<K, V> implements Map, Serializable, GrantedAuthority {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(CmMap.class);

	private HashMap map;
	
	private String authority;

	public CmMap() {
		map = new HashMap();
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return map.containsValue(value);
	}

	@Override
	public Set entrySet() {
		return map.entrySet();
	}

	@Override
	public Object get(Object key) {
		return map.get(key);
	}

	public int getInt(String key) {
		int result = 0;

		try {
			result = Integer.parseInt(String.valueOf(map.get(key)));
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}

	public int getInt(String key, int defaultValue) {
		int result = 0;

		try {
			result = Integer.parseInt(String.valueOf(map.get(key)));
		} catch (Exception e) {
			result = defaultValue;
		}
		return result;
	}

	public String getString(String key) {
		return (map.get(key) == null ? "" : String.valueOf(map.get(key)));
	}

	public String[] getStringArray(String key) {
		if (map.get(key) == null)
			return null;
		if (!map.get(key).getClass().isArray()) {
			
			logger.info("isArray : true");
			
			String[] result = { "" };
			result[0] = (String) map.get(key);
			
			return result;
		}
		return (String[]) map.get(key);
	}
	
	public List<CmMap> getList(String key) {
		if (map.get(key) == null)
			return null;
		if (!map.get(key).getClass().isArray()) {
			return (List<CmMap>) map.get(key);
		}
		return (List<CmMap>) map.get(key);
	}
	
	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public Set keySet() {
		return map.keySet();
	}

	@Override
	public Object put(Object key, Object value) {
		if (value == null)
			value = "";

		if (value instanceof oracle.sql.CLOB)
			return map.put(key.toString(), clobToString((CLOB) value));
		else
			return map.put(key.toString(), value);
	}

	public Object putDefault(Object key, Object value) {
		if (map.get(key) == null) {
			if (value == null)
				value = "";

			if (value instanceof oracle.sql.CLOB)
				return map.put(key.toString(), clobToString((CLOB) value));
			else
				return map.put(key.toString(), value);
		} else {
			return map.put(key.toString(), String.valueOf(map.get(key)));
		}
	}

	public Object k(Object key, Object value) {
		if (value == null)
			value = "";

		return map.put(key.toString(), value);
	}

	@Override
	public void putAll(Map map) {
		map.putAll(map);
	}

	@Override
	public Object remove(Object key) {
		return map.remove(key);
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public Collection values() {
		return map.values();
	}

	public Object putNoLowercase(Object key, Object value) {
		if (value == null)
			value = "";

		return map.put(key.toString(), value);
	}

	public String clobToString(CLOB value) {
		StringBuffer sbf = new StringBuffer();
		Reader rd = null;
		char[] buf = new char[1024];
		int readCnt = 0;

		try {
			rd = value.getCharacterStream();
			while ((readCnt = rd.read(buf, 0, 1024)) != -1) {
				sbf.append(buf, 0, readCnt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rd != null) {
					rd.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return sbf.toString();
	}

	public long getLong(String key) {
		return Long.parseLong(String.valueOf(map.get(key)));
	}

	public double getDouble(String key) {
		return Double.parseDouble(String.valueOf(map.get(key)));
	}

	@Override
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
