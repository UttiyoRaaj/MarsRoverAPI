package com.utydevs.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestParam;


@Entity
@Table(name = "mars_api_preferences")
public class HomeDto {

//	@RequestParam(required = false) String marsRoverApiData
//	@RequestParam(required = false) Integer marsSol
//	@RequestParam(required = false) Boolean defaultCheck
	

	
//	FHAZ	Front Hazard Avoidance Camera
//	RHAZ	Rear Hazard Avoidance Camera
//	MAST	Mast Camera
//	CHEMCAM	Chemistry and Camera Complex
//	MAHLI	Mars Hand Lens Imager
//	MARDI	Mars Descent Imager
//	NAVCAM	Navigation Camera
//	PANCAM	Panoramic Camera
//	MINITES	Miniature Thermal Emission Spectrometer (Mini-TES)
	

	private Long userId;
	private String marsRoverApiData;
	private Integer marsSol;
	private Boolean cameraFhaz;
	private Boolean cameraRhaz;
	private Boolean cameraMast;
	private Boolean cameraChemcam;
	private Boolean cameraMahli;
	private Boolean cameraMardi;
	private Boolean cameraNavcam;
	private Boolean cameraPancam;
	private Boolean cameraMinites;
	private Boolean rememberPreferences;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Boolean getRememberPreferences() {
		return rememberPreferences;
	}
	public void setRememberPreferences(Boolean rememberPreferences) {
		this.rememberPreferences = rememberPreferences;
	}
	public Boolean getCameraFhaz() {
		return cameraFhaz;
	}
	public void setCameraFhaz(Boolean cameraFhaz) {
		this.cameraFhaz = cameraFhaz;
	}
	public Boolean getCameraRhaz() {
		return cameraRhaz;
	}
	public void setCameraRhaz(Boolean cameraRhaz) {
		this.cameraRhaz = cameraRhaz;
	}
	public Boolean getCameraMast() {
		return cameraMast;
	}
	public void setCameraMast(Boolean cameraMast) {
		this.cameraMast = cameraMast;
	}
	public Boolean getCameraChemcam() {
		return cameraChemcam;
	}
	public void setCameraChemcam(Boolean cameraChemcam) {
		this.cameraChemcam = cameraChemcam;
	}
	public Boolean getCameraMahli() {
		return cameraMahli;
	}
	public void setCameraMahli(Boolean cameraMahli) {
		this.cameraMahli = cameraMahli;
	}
	public Boolean getCameraMardi() {
		return cameraMardi;
	}
	public void setCameraMardi(Boolean cameraMardi) {
		this.cameraMardi = cameraMardi;
	}
	public Boolean getCameraNavcam() {
		return cameraNavcam;
	}
	public void setCameraNavcam(Boolean cameraNavcam) {
		this.cameraNavcam = cameraNavcam;
	}
	public Boolean getCameraPancam() {
		return cameraPancam;
	}
	public void setCameraPancam(Boolean cameraPancam) {
		this.cameraPancam = cameraPancam;
	}
	public Boolean getCameraMinites() {
		return cameraMinites;
	}
	public void setCameraMinites(Boolean cameraMinites) {
		this.cameraMinites = cameraMinites;
	}
	
	@Column(length = 20)
	public String getMarsRoverApiData() {
		return marsRoverApiData;
	}
	public void setMarsRoverApiData(String marsRoverApiData) {
		this.marsRoverApiData = marsRoverApiData;
	}
	public Integer getMarsSol() {
		return marsSol;
	}
	public void setMarsSol(Integer marsSol) {
		this.marsSol = marsSol;
	}
	@Override
	public String toString() {
		return "HomeDto [marsRoverApiData=" + marsRoverApiData + ", marsSol=" + marsSol + ", userId=" + userId
				+ ", cameraFhaz=" + cameraFhaz + ", cameraRhaz=" + cameraRhaz + ", cameraMast=" + cameraMast
				+ ", cameraChemcam=" + cameraChemcam + ", cameraMahli=" + cameraMahli + ", cameraMardi=" + cameraMardi
				+ ", cameraNavcam=" + cameraNavcam + ", cameraPancam=" + cameraPancam + ", cameraMinites="
				+ cameraMinites + ", rememberPreferences=" + rememberPreferences + "]";
	}
	
	
}
