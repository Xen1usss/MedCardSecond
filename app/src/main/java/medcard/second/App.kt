package medcard.second

import android.app.Application
import medcard.second.di.myModule
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(myModule)
        }
    }
}