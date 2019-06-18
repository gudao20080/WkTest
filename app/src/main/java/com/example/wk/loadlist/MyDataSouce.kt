package com.example.wk.loadlist

import android.arch.paging.PageKeyedDataSource
import android.arch.paging.PositionalDataSource

class MyDataSouce: PositionalDataSource<Int>() {

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Int>) {

    }

    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Int>) {

    }
}

class MyKeyDataSource : PageKeyedDataSource<String, Int>() {

    override fun loadInitial(params: LoadInitialParams<String>, callback: LoadInitialCallback<String, Int>) {

    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<String, Int>) {

    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<String, Int>) {

    }
}

