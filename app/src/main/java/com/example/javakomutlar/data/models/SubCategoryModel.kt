package com.example.javakomutlar.data.models

import com.google.gson.annotations.SerializedName

data class SubCategoryModel(

	@field:SerializedName("documents")
	val documents: List<DocumentsItem?>? = null
)


