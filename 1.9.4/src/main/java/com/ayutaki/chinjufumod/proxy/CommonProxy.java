package com.ayutaki.chinjufumod.proxy;

import com.ayutaki.chinjufumod.config.CMConfigCore;

public class CommonProxy {


	public void preInit() {
		//init アイテム・ブロックの登録、コンフィグ読込など事前の初期化作業を行う

		/*コンフィグ*/
		CMConfigCore.preInit();
	}


	public void init() {
		//RegisterRender レシピ追加、レンダー登録など

	}

	public void registerRenders() {

	}

	public void registerEntityRender() {

	}

	public void postInit() {
		//他Modとの連携
	}

}
