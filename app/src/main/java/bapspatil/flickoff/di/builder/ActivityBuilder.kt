package bapspatil.flickoff.di.builder

import bapspatil.flickoff.ui.DetailsActivity
import bapspatil.flickoff.ui.MainActivity
import bapspatil.flickoff.ui.SplashScreenActivity
import bapspatil.flickoff.ui.about.AboutActivity
import bapspatil.flickoff.ui.about.AboutActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/*
** Created by Bapusaheb Patil {@link https://bapspatil.com}
*/

@Module
abstract class ActivityBuilder  {

    @ContributesAndroidInjector(modules = [AboutActivityModule::class])
    abstract fun bindAboutActivity() : AboutActivity

    @ContributesAndroidInjector
    abstract fun bindDetailsActivity() : DetailsActivity

    @ContributesAndroidInjector
    abstract fun bindMainActivity() : MainActivity

    @ContributesAndroidInjector
    abstract fun bindSplashScreenActivity() : SplashScreenActivity

}