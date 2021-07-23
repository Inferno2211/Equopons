package appinventor.ai_hackathonpv2021.Hackathon;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

/* compiled from: screen_1.yail */
public class screen_1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("screen_1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final FString Lit14 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement2").readResolve());
    static final IntNum Lit16;
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit18 = IntNum.make(-2);
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final FString Lit20 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit23 = IntNum.make(3);
    static final IntNum Lit24;
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit26 = IntNum.make(-1007);
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit32 = IntNum.make(25);
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("HasMargins").readResolve());
    static final IntNum Lit35 = IntNum.make(-1010);
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit38 = IntNum.make(1);
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit4;
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("Label9").readResolve());
    static final IntNum Lit42;
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Label10").readResolve());
    static final IntNum Lit46 = IntNum.make(-1007);
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit48 = IntNum.make(16777215);
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement3").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit53 = IntNum.make(2);
    static final IntNum Lit54 = IntNum.make(16777215);
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("Button3").readResolve());
    static final IntNum Lit58;
    static final IntNum Lit59 = IntNum.make(30);
    static final IntNum Lit6;
    static final IntNum Lit60 = IntNum.make(-1015);
    static final IntNum Lit61;
    static final IntNum Lit62 = IntNum.make(-1080);
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit64 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1626985825293_0.8746467578274589-0/youngandroidproject/../src/appinventor/ai_hackathonpv2021/Hackathon/screen_1.yail", 487503);
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Button3$Click").readResolve());
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("Label11").readResolve());
    static final IntNum Lit69 = IntNum.make(-1007);
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final IntNum Lit70 = IntNum.make(16777215);
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("Button4").readResolve());
    static final IntNum Lit74;
    static final IntNum Lit75 = IntNum.make(-1015);
    static final IntNum Lit76;
    static final IntNum Lit77 = IntNum.make(-1080);
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit79 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1626985825293_0.8746467578274589-0/youngandroidproject/../src/appinventor/ai_hackathonpv2021/Hackathon/screen_1.yail", 610385);
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Button4$Click").readResolve());
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Label12").readResolve());
    static final IntNum Lit83 = IntNum.make(-1007);
    static final IntNum Lit84 = IntNum.make(16777215);
    static final FString Lit85 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Button5").readResolve());
    static final IntNum Lit88;
    static final IntNum Lit89 = IntNum.make(-1015);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final IntNum Lit90;
    static final IntNum Lit91 = IntNum.make(-1080);
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit93;
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("Button5$Click").readResolve());
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public static screen_1 screen_1;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button3;
    public final ModuleMethod Button3$Click;
    public Button Button4;
    public final ModuleMethod Button4$Click;
    public Button Button5;
    public final ModuleMethod Button5$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public Label Label10;
    public Label Label11;
    public Label Label12;
    public Label Label8;
    public Label Label9;
    public VerticalArrangement VerticalArrangement2;
    public VerticalArrangement VerticalArrangement3;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit93 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1626985825293_0.8746467578274589-0/youngandroidproject/../src/appinventor/ai_hackathonpv2021/Hackathon/screen_1.yail", 733265);
        int[] iArr = new int[2];
        iArr[0] = -16777216;
        Lit90 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1624763;
        Lit88 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -16777216;
        Lit76 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -1624763;
        Lit74 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -16777216;
        Lit61 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -1624763;
        Lit58 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -1;
        Lit42 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -1;
        Lit24 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -1;
        Lit16 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -5513768;
        Lit6 = IntNum.make(iArr10);
    }

    public screen_1() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit95, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit96, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit97, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit98, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit99, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit100, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit101, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit102, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit103, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit104, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit105, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit106, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit107, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit108, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime7688346696957088787.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 34, null, 0);
        this.Button3$Click = new ModuleMethod(frame2, 35, Lit65, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 39, null, 0);
        this.Button4$Click = new ModuleMethod(frame2, 40, Lit80, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 43, null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 44, null, 0);
        this.Button5$Click = new ModuleMethod(frame2, 45, Lit94, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        runtime.$instance.run();
        this.$Stdebug$Mnform$St = Boolean.FALSE;
        this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
        if (stringAppend == null) {
            obj = null;
        } else {
            obj = stringAppend.toString();
        }
        this.global$Mnvar$Mnenvironment = Environment.make(obj);
        screen_1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "TalkToMe", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "portrait", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Boolean.FALSE, Lit10);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Fixed", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Home", Lit4);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit10), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        this.VerticalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit14, Lit15, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit19, Lit15, lambda$Fn4);
        }
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit15, Lit20, Lit21, lambda$Fn5), $result);
        } else {
            addToComponents(Lit15, Lit27, Lit21, lambda$Fn6);
        }
        this.Label8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit28, Lit29, lambda$Fn7), $result);
        } else {
            addToComponents(Lit21, Lit39, Lit29, lambda$Fn8);
        }
        this.Label9 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit15, Lit40, Lit41, lambda$Fn9), $result);
        } else {
            addToComponents(Lit15, Lit43, Lit41, lambda$Fn10);
        }
        this.Label10 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit44, Lit45, lambda$Fn11), $result);
        } else {
            addToComponents(Lit0, Lit49, Lit45, lambda$Fn12);
        }
        this.VerticalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit50, Lit51, lambda$Fn13), $result);
        } else {
            addToComponents(Lit0, Lit55, Lit51, lambda$Fn14);
        }
        this.Button3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit51, Lit56, Lit57, lambda$Fn15), $result);
        } else {
            addToComponents(Lit51, Lit63, Lit57, lambda$Fn16);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit65, this.Button3$Click);
        } else {
            addToFormEnvironment(Lit65, this.Button3$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button3", "Click");
        } else {
            addToEvents(Lit57, Lit66);
        }
        this.Label11 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit51, Lit67, Lit68, lambda$Fn17), $result);
        } else {
            addToComponents(Lit51, Lit71, Lit68, lambda$Fn18);
        }
        this.Button4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit51, Lit72, Lit73, lambda$Fn19), $result);
        } else {
            addToComponents(Lit51, Lit78, Lit73, lambda$Fn20);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit80, this.Button4$Click);
        } else {
            addToFormEnvironment(Lit80, this.Button4$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button4", "Click");
        } else {
            addToEvents(Lit73, Lit66);
        }
        this.Label12 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit51, Lit81, Lit82, lambda$Fn21), $result);
        } else {
            addToComponents(Lit51, Lit85, Lit82, lambda$Fn22);
        }
        this.Button5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit51, Lit86, Lit87, lambda$Fn23), $result);
        } else {
            addToComponents(Lit51, Lit92, Lit87, lambda$Fn24);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit94, this.Button5$Click);
        } else {
            addToFormEnvironment(Lit94, this.Button5$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button5", "Click");
        } else {
            addToEvents(Lit87, Lit66);
        }
        runtime.initRuntime();
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "TalkToMe", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "portrait", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Boolean.FALSE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Fixed", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Home", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit10);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit5, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit17, Lit18, Lit7);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit5, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit17, Lit18, Lit7);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit21, Lit22, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit21, Lit5, Lit24, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit21, Lit25, Lit26, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit17, Lit18, Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit21, Lit22, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit21, Lit5, Lit24, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit21, Lit25, Lit26, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit17, Lit18, Lit7);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit31, Lit32, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit33, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit34, Boolean.FALSE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit35, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit36, "EQOUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit37, Lit38, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit17, Lit18, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit31, Lit32, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit33, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit34, Boolean.FALSE, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit35, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit36, "EQOUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit37, Lit38, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit17, Lit18, Lit7);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit5, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit36, "Coupons To Promote Equality", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit37, Lit38, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit17, Lit18, Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit5, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit33, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit36, "Coupons To Promote Equality", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit37, Lit38, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit17, Lit18, Lit7);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit25, Lit46, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit36, "Text for Label10", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit47, Lit48, Lit7);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit25, Lit46, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit36, "Text for Label10", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit47, Lit48, Lit7);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit22, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit52, Lit53, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit5, Lit54, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit17, Lit18, Lit7);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit22, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit52, Lit53, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit5, Lit54, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit17, Lit18, Lit7);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit57, Lit5, Lit58, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit31, Lit59, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit25, Lit60, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit36, "ABOUT US", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit47, Lit61, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit17, Lit62, Lit7);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit57, Lit5, Lit58, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit31, Lit59, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit25, Lit60, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit36, "ABOUT US", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit47, Lit61, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit17, Lit62, Lit7);
    }

    public Object Button3$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("About_us"), Lit64, "open another screen");
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit25, Lit69, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit68, Lit36, "Text for Label10", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit47, Lit70, Lit7);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit25, Lit69, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit68, Lit36, "Text for Label10", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit47, Lit70, Lit7);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit5, Lit74, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit31, Lit59, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit25, Lit75, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit36, "COUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit47, Lit76, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit17, Lit77, Lit7);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit5, Lit74, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit31, Lit59, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit25, Lit75, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit36, "COUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit47, Lit76, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit17, Lit77, Lit7);
    }

    public Object Button4$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Categories"), Lit79, "open another screen");
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit25, Lit83, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit36, "Text for Label10", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit47, Lit84, Lit7);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit25, Lit83, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit36, "Text for Label10", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit47, Lit84, Lit7);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit5, Lit88, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit31, Lit59, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit25, Lit89, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit36, "CONTACT US", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit47, Lit90, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit17, Lit91, Lit7);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit5, Lit88, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit31, Lit59, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit25, Lit89, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit36, "CONTACT US", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit47, Lit90, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit17, Lit91, Lit7);
    }

    public Object Button5$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Contact_us"), Lit93, "open another screen");
    }

    /* compiled from: screen_1.yail */
    public class frame extends ModuleBody {
        screen_1 $main;

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof screen_1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return super.match1(moduleMethod, obj, callContext);
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof screen_1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                case 7:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof screen_1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof screen_1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 4:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return super.apply1(moduleMethod, obj);
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    screen_1 screen_1 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen_1.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                case 7:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                default:
                    return super.apply2(moduleMethod, obj, obj2);
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return screen_1.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return screen_1.lambda3();
                case 21:
                    return screen_1.lambda4();
                case 22:
                    return screen_1.lambda5();
                case 23:
                    return screen_1.lambda6();
                case 24:
                    return screen_1.lambda7();
                case 25:
                    return screen_1.lambda8();
                case 26:
                    return screen_1.lambda9();
                case 27:
                    return screen_1.lambda10();
                case 28:
                    return screen_1.lambda11();
                case 29:
                    return screen_1.lambda12();
                case 30:
                    return screen_1.lambda13();
                case 31:
                    return screen_1.lambda14();
                case 32:
                    return screen_1.lambda15();
                case 33:
                    return screen_1.lambda16();
                case 34:
                    return screen_1.lambda17();
                case 35:
                    return this.$main.Button3$Click();
                case 36:
                    return screen_1.lambda18();
                case 37:
                    return screen_1.lambda19();
                case 38:
                    return screen_1.lambda20();
                case 39:
                    return screen_1.lambda21();
                case 40:
                    return this.$main.Button4$Click();
                case 41:
                    return screen_1.lambda22();
                case 42:
                    return screen_1.lambda23();
                case 43:
                    return screen_1.lambda24();
                case 44:
                    return screen_1.lambda25();
                case 45:
                    return this.$main.Button5$Click();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    @Override // com.google.appinventor.components.runtime.AppInventorCompatActivity, com.google.appinventor.components.runtime.Form
    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        int i = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (i != 0) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (i == 0) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, lists.cons(componentObject, lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    @Override // com.google.appinventor.components.runtime.Form
    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        screen_1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            Object reverse = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                try {
                    Pair arg02 = (Pair) reverse;
                    misc.force(arg02.getCar());
                    reverse = arg02.getCdr();
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "arg0", -2, reverse);
                }
            }
            Object obj3 = components;
            while (obj3 != LList.Empty) {
                try {
                    Pair arg03 = (Pair) obj3;
                    Object component$Mninfo = arg03.getCar();
                    Object component$Mnname = lists.caddr.apply1(component$Mninfo);
                    lists.cadddr.apply1(component$Mninfo);
                    Object component$Mntype = lists.cadr.apply1(component$Mninfo);
                    Object apply13 = lists.car.apply1(component$Mninfo);
                    try {
                        Object component$Mnobject = Invoke.make.apply2(component$Mntype, lookupInFormEnvironment((Symbol) apply13));
                        SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                        try {
                            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                            obj3 = arg03.getCdr();
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "add-to-form-environment", 0, component$Mnname);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "lookup-in-form-environment", 0, apply13);
                    }
                } catch (ClassCastException e5) {
                    throw new WrongType(e5, "arg0", -2, obj3);
                }
            }
            Object reverse2 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                try {
                    Pair arg04 = (Pair) reverse2;
                    Object var$Mnval = arg04.getCar();
                    Object var = lists.car.apply1(var$Mnval);
                    try {
                        addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                        reverse2 = arg04.getCdr();
                    } catch (ClassCastException e6) {
                        throw new WrongType(e6, "add-to-global-var-environment", 0, var);
                    }
                } catch (ClassCastException e7) {
                    throw new WrongType(e7, "arg0", -2, reverse2);
                }
            }
            Object obj4 = components;
            while (obj4 != LList.Empty) {
                try {
                    Pair arg05 = (Pair) obj4;
                    Object component$Mninfo2 = arg05.getCar();
                    lists.caddr.apply1(component$Mninfo2);
                    Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                    if (init$Mnthunk != Boolean.FALSE) {
                        Scheme.applyToArgs.apply1(init$Mnthunk);
                    }
                    obj4 = arg05.getCdr();
                } catch (ClassCastException e8) {
                    throw new WrongType(e8, "arg0", -2, obj4);
                }
            }
            Object obj5 = components;
            while (obj5 != LList.Empty) {
                try {
                    Pair arg06 = (Pair) obj5;
                    Object component$Mninfo3 = arg06.getCar();
                    Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                    lists.cadddr.apply1(component$Mninfo3);
                    callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                    obj5 = arg06.getCdr();
                } catch (ClassCastException e9) {
                    throw new WrongType(e9, "arg0", -2, obj5);
                }
            }
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
