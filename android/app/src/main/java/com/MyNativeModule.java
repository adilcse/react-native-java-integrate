import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class MyNativeModule extends ReactContextBaseJavaModule {

    public MyNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void addTwoNumbers(int a, int b, Promise promise) {
        int result = a + b;
        promise.resolve(result);
    }

    @Override
    public String getName() {
        return "MyNativeModule";
    }
}
