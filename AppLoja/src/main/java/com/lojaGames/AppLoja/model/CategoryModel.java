package com.lojaGames.AppLoja.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	@Entity
	@Table (name = "tb_category")
	public class CategoryModel {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idCategory;
		
		@NotBlank
		@Size (min = 5, max = 100)
		private String name;
		
		@NotBlank
		@Size (min = 5, max = 500)
		private String descriptionCategoria;

		public Long getIdCategory() {
			return idCategory;
		}

		public void setIdCategory(Long idCategory) {
			this.idCategory = idCategory;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescriptionCategoria() {
			return descriptionCategoria;
		}

		public void setDescriptionCategoria(String descriptionCategoria) {
			this.descriptionCategoria = descriptionCategoria;
		}
		
		

	
}