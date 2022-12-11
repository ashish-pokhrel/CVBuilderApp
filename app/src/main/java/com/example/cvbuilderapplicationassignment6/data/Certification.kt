package com.example.cvbuilderapplicationassignment6.data

data class Certification(
    val logo: String,
    val name: String
) {
    companion object {
        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    "https://attackofthefanboy.com/wp-content/uploads/2014/07/Microsoft-Logo.jpg",
                    "Microsoft Cloud Fundamental"
                ),
                Certification(
                    "https://i.ytimg.com/vi/NP_5LHuZTo8/maxresdefault.jpg",
                    "Git and GitHub"
                )
            )
        }
    }
}
