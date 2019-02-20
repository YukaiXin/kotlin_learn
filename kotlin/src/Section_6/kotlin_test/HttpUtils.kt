package Section_6.kotlin_test

/**
 * Created by kxyu on 2019/2/19
 */
//object HttpUtils {
//    val client = OkHttpClient()
//    @Throws(Exception::class)
//    fun getSync(url: String): String? {
//        val request = Request.Builder()
//                .url(url)
//                .build()
//        val response = client.newCall(request).execute()
//        if (! response.isSuccessful()) throw IOException("Unexpected code " + response)
//        val responseHeaders = response.headers()
//        for (i in 0..responseHeaders.size() - 1) {
//            println(responseHeaders.name(i) + ": " + responseHeaders.value(i))
//        }
//        return response.body()? .string()
//    }
//    @Throws(Exception::class)
//    fun getAsync(url: String) {
//        var result: String? = ""
//        val request = Request.Builder()
//                .url(url)
//                .build()
//        client.newCall(request).enqueue(object : Callback {
//            override fun onFailure(call: Call, e: IOException? ) {
//                e? .printStackTrace()
//            }
//            @Throws(IOException::class)
//            override fun onResponse(call: Call, response: Response) {
//                if (! response.isSuccessful()) throw IOException("Unexpected
//                        code " + response)
//                        val responseHeaders = response.headers()
//                for (i in 0..responseHeaders.size() - 1) {
//                    println(responseHeaders.name(i) + ": " + responseHeaders.value(i))
//                }
//                result = response.body()? .string()
//                println(result)
//            }
//        })
//    }
//}