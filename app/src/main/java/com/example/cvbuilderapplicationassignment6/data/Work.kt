package com.example.cvbuilderapplicationassignment6.data

data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: String,
    val roles: String
) {
    companion object {
        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "Xylontech",
                    "Feb 2019",
                    "Dec 2022",
                    "ktm, Nepal",
                    "https://th.bing.com/th/id/OIP.tEnCZz4MHn_k3xqn12snlwAAAA?pid=ImgDet&rs=1",
                    "Software Engineer"
                ),
                Work(
                    "Perfect Active Solutions",
                    "Apr 2017",
                    "Feb 2019",
                    "Kathmandu, Nepal",
                    "data:image/jpeg;base64,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",
                    "Software Developer"
                )
            )
        }
    }
}
