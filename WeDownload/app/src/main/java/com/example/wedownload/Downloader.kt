package com.example.wedownload

interface Downloader {
    fun downloadFile(url:String):Long
}