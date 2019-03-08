import com.example.koinbasic.HelloRepository
import com.example.koinbasic.HelloRepositoryImpl
import com.example.koinbasic.MySimplePresenter
import org.koin.dsl.module.module

val appModule = module {

    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // Simple Presenter Factory
    factory { MySimplePresenter(get()) }
}