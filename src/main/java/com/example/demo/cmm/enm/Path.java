package com.example.demo.cmm.enm;

public enum Path {
	DEFAULT_PROFILE;
	@Override
	public String toString() {
		String result ="";
		switch (this) {
		case DEFAULT_PROFILE:
			result = "https://www.netclipart.com/pp/m/232-2329525_person-svg-shadow-default-profile-picture-png.png";
		}
		return result;
	}
}
