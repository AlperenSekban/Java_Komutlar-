package com.example.javakomutlar.data.models

import com.google.gson.annotations.SerializedName

data class HomeCategoryModel(

	@field:SerializedName("documents")
	val documents: List<DocumentsItem?>? = null
)

data class Title(

	@field:SerializedName("stringValue")
	val stringValue: String? = null
)

data class Type(

	@field:SerializedName("stringValue")
	val stringValue: String? = null
)

data class Fields(

	@field:SerializedName("type")
	val type: Type? = null,

	@field:SerializedName("title")
	val title: Title? = null
)

data class DocumentsItem(

	@field:SerializedName("createTime")
	val createTime: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("updateTime")
	val updateTime: String? = null,

	@field:SerializedName("fields")
	val fields: Fields? = null
)
