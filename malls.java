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
import com.google.appinventor.components.runtime.Image;
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

/* compiled from: malls.yail */
public class malls extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("malls").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final IntNum Lit100 = IntNum.make(16777215);
    static final IntNum Lit101;
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement3").readResolve());
    static final IntNum Lit105 = IntNum.make(16777215);
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit107 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Label13").readResolve());
    static final FString Lit109 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final FString Lit110 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("Label14").readResolve());
    static final FString Lit112 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit113 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("Label15").readResolve());
    static final IntNum Lit115 = IntNum.make(-1050);
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit117 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("Button13").readResolve());
    static final IntNum Lit119;
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final IntNum Lit120;
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit122;
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("Button13$Click").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit130 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit132 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit133 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final FString Lit14 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final IntNum Lit16;
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit18 = IntNum.make(-2);
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final FString Lit20 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit23 = IntNum.make(3);
    static final IntNum Lit24;
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit26 = IntNum.make(-1007);
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Image2").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Clickable").readResolve());
    static final IntNum Lit31 = IntNum.make(-1006);
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit33 = IntNum.make(-1010);
    static final FString Lit34 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit35 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1626985825293_0.8746467578274589-0/youngandroidproject/../src/appinventor/ai_hackathonpv2021/Hackathon/malls.yail", 225359);
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Image2$Click").readResolve());
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit42 = IntNum.make(25);
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("HasMargins").readResolve());
    static final IntNum Lit45 = IntNum.make(-1010);
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit48 = IntNum.make(1);
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Image3").readResolve());
    static final IntNum Lit52 = IntNum.make(-1006);
    static final IntNum Lit53 = IntNum.make(-1010);
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("Label9").readResolve());
    static final IntNum Lit57;
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit6;
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit61 = IntNum.make(16777215);
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit63;
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("Button5").readResolve());
    static final IntNum Lit67 = IntNum.make(16777215);
    static final IntNum Lit68;
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement2").readResolve());
    static final IntNum Lit72 = IntNum.make(16777215);
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Label10").readResolve());
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Label11").readResolve());
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("Scrollable").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Label12").readResolve());
    static final IntNum Lit82 = IntNum.make(-1050);
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Button6").readResolve());
    static final IntNum Lit86;
    static final IntNum Lit87 = IntNum.make(0);
    static final IntNum Lit88;
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final PairWithPosition Lit90 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1626985825293_0.8746467578274589-0/youngandroidproject/../src/appinventor/ai_hackathonpv2021/Hackathon/malls.yail", 733263);
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("Button6$Click").readResolve());
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Button8").readResolve());
    static final IntNum Lit94 = IntNum.make(16777215);
    static final IntNum Lit95 = IntNum.make(-1010);
    static final IntNum Lit96;
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Button9").readResolve());
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
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public static malls malls;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public Button Button13;
    public final ModuleMethod Button13$Click;
    public Button Button5;
    public Button Button6;
    public final ModuleMethod Button6$Click;
    public Button Button8;
    public Button Button9;
    public HorizontalArrangement HorizontalArrangement2;
    public Image Image2;
    public final ModuleMethod Image2$Click;
    public Image Image3;
    public Label Label10;
    public Label Label11;
    public Label Label12;
    public Label Label13;
    public Label Label14;
    public Label Label15;
    public Label Label8;
    public Label Label9;
    public VerticalArrangement VerticalArrangement1;
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
        Lit122 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1626985825293_0.8746467578274589-0/youngandroidproject/../src/appinventor/ai_hackathonpv2021/Hackathon/malls.yail", 1056848);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit120 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -1624763;
        Lit119 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -13615022;
        Lit101 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -16777216;
        Lit96 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit88 = IntNum.make(iArr5);
        int[] iArr6 = new int[2];
        iArr6[0] = -1624763;
        Lit86 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -13615022;
        Lit68 = IntNum.make(iArr7);
        int[] iArr8 = new int[2];
        iArr8[0] = -16777216;
        Lit63 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -1;
        Lit57 = IntNum.make(iArr9);
        int[] iArr10 = new int[2];
        iArr10[0] = -1;
        Lit24 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -1;
        Lit16 = IntNum.make(iArr11);
        int[] iArr12 = new int[2];
        iArr12[0] = -5513768;
        Lit6 = IntNum.make(iArr12);
    }

    public malls() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit124, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit125, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit126, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit127, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit128, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit129, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit130, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit131, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit132, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit133, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit134, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit135, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit136, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit137, 8194);
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
        this.Image2$Click = new ModuleMethod(frame2, 27, Lit36, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 34, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 46, null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 47, null, 0);
        this.Button6$Click = new ModuleMethod(frame2, 48, Lit91, 0);
        lambda$Fn29 = new ModuleMethod(frame2, 49, null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 50, null, 0);
        lambda$Fn31 = new ModuleMethod(frame2, 51, null, 0);
        lambda$Fn32 = new ModuleMethod(frame2, 52, null, 0);
        lambda$Fn33 = new ModuleMethod(frame2, 53, null, 0);
        lambda$Fn34 = new ModuleMethod(frame2, 54, null, 0);
        lambda$Fn35 = new ModuleMethod(frame2, 55, null, 0);
        lambda$Fn36 = new ModuleMethod(frame2, 56, null, 0);
        lambda$Fn37 = new ModuleMethod(frame2, 57, null, 0);
        lambda$Fn38 = new ModuleMethod(frame2, 58, null, 0);
        lambda$Fn39 = new ModuleMethod(frame2, 59, null, 0);
        lambda$Fn40 = new ModuleMethod(frame2, 60, null, 0);
        lambda$Fn41 = new ModuleMethod(frame2, 61, null, 0);
        lambda$Fn42 = new ModuleMethod(frame2, 62, null, 0);
        this.Button13$Click = new ModuleMethod(frame2, 63, Lit123, 0);
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
        malls = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Hackathon", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.TRUE, Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Boolean.FALSE, Lit9);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Fixed", Lit4);
            runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Recreation", Lit4);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit9), $result);
        } else {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        this.VerticalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit14, Lit15, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit19, Lit15, lambda$Fn4);
        }
        this.HorizontalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit15, Lit20, Lit21, lambda$Fn5), $result);
        } else {
            addToComponents(Lit15, Lit27, Lit21, lambda$Fn6);
        }
        this.Image2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit28, Lit29, lambda$Fn7), $result);
        } else {
            addToComponents(Lit21, Lit34, Lit29, lambda$Fn8);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit36, this.Image2$Click);
        } else {
            addToFormEnvironment(Lit36, this.Image2$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image2", "Click");
        } else {
            addToEvents(Lit29, Lit37);
        }
        this.Label8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit38, Lit39, lambda$Fn9), $result);
        } else {
            addToComponents(Lit21, Lit49, Lit39, lambda$Fn10);
        }
        this.Image3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit50, Lit51, lambda$Fn11), $result);
        } else {
            addToComponents(Lit21, Lit54, Lit51, lambda$Fn12);
        }
        this.Label9 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit15, Lit55, Lit56, lambda$Fn13), $result);
        } else {
            addToComponents(Lit15, Lit58, Lit56, lambda$Fn14);
        }
        this.Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit59, Lit60, lambda$Fn15), $result);
        } else {
            addToComponents(Lit0, Lit64, Lit60, lambda$Fn16);
        }
        this.Button5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit65, Lit66, lambda$Fn17), $result);
        } else {
            addToComponents(Lit0, Lit69, Lit66, lambda$Fn18);
        }
        this.VerticalArrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit71, lambda$Fn19), $result);
        } else {
            addToComponents(Lit0, Lit73, Lit71, lambda$Fn20);
        }
        this.Label10 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit74, Lit75, lambda$Fn21), $result);
        } else {
            addToComponents(Lit71, Lit76, Lit75, lambda$Fn22);
        }
        this.Label11 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit77, Lit78, lambda$Fn23), $result);
        } else {
            addToComponents(Lit71, Lit79, Lit78, lambda$Fn24);
        }
        this.Label12 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit80, Lit81, lambda$Fn25), $result);
        } else {
            addToComponents(Lit71, Lit83, Lit81, lambda$Fn26);
        }
        this.Button6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit84, Lit85, lambda$Fn27), $result);
        } else {
            addToComponents(Lit71, Lit89, Lit85, lambda$Fn28);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit91, this.Button6$Click);
        } else {
            addToFormEnvironment(Lit91, this.Button6$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button6", "Click");
        } else {
            addToEvents(Lit85, Lit37);
        }
        this.Button8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit92, Lit93, lambda$Fn29), $result);
        } else {
            addToComponents(Lit0, Lit97, Lit93, lambda$Fn30);
        }
        this.Button9 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit98, Lit99, lambda$Fn31), $result);
        } else {
            addToComponents(Lit0, Lit102, Lit99, lambda$Fn32);
        }
        this.VerticalArrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit103, Lit104, lambda$Fn33), $result);
        } else {
            addToComponents(Lit0, Lit106, Lit104, lambda$Fn34);
        }
        this.Label13 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit107, Lit108, lambda$Fn35), $result);
        } else {
            addToComponents(Lit104, Lit109, Lit108, lambda$Fn36);
        }
        this.Label14 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit110, Lit111, lambda$Fn37), $result);
        } else {
            addToComponents(Lit104, Lit112, Lit111, lambda$Fn38);
        }
        this.Label15 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit113, Lit114, lambda$Fn39), $result);
        } else {
            addToComponents(Lit104, Lit116, Lit114, lambda$Fn40);
        }
        this.Button13 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit104, Lit117, Lit118, lambda$Fn41), $result);
        } else {
            addToComponents(Lit104, Lit121, Lit118, lambda$Fn42);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            runtime.addToCurrentFormEnvironment(Lit123, this.Button13$Click);
        } else {
            addToFormEnvironment(Lit123, this.Button13$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button13", "Click");
        } else {
            addToEvents(Lit118, Lit37);
        }
        runtime.initRuntime();
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Hackathon", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Boolean.FALSE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Fixed", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Recreation", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit9);
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
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit31, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, "image_2021-07-22_194813-removebg-preview.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit17, Lit33, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit31, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, "image_2021-07-22_194813-removebg-preview.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit17, Lit33, Lit7);
    }

    public Object Image2$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("screen_1"), Lit35, "open another screen");
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit41, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit43, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit44, Boolean.FALSE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit25, Lit45, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit46, "EQOUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit47, Lit48, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit17, Lit18, Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit41, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit43, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit44, Boolean.FALSE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit25, Lit45, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit46, "EQOUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit47, Lit48, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit17, Lit18, Lit7);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit52, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit32, "image_2021-07-22_195521.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit17, Lit53, Lit7);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit52, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit32, "image_2021-07-22_195521.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit17, Lit53, Lit7);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit5, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit43, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit46, "Coupons To Promote Equality", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit47, Lit48, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit17, Lit18, Lit7);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit56, Lit5, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit43, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit46, "Coupons To Promote Equality", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit56, Lit47, Lit48, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit56, Lit17, Lit18, Lit7);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit5, Lit61, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit40, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit41, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit46, "INFINITY MALL", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit62, Lit63, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit17, Lit18, Lit7);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit5, Lit61, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit40, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit41, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit46, "INFINITY MALL", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit62, Lit63, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit17, Lit18, Lit7);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit5, Lit67, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit46, "Shopping complex with a huge variety of restaurants", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit62, Lit68, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit17, Lit18, Lit7);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit66, Lit5, Lit67, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit46, "Shopping complex with a huge variety of restaurants", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit66, Lit62, Lit68, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit17, Lit18, Lit7);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit5, Lit72, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit17, Lit18, Lit7);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit5, Lit72, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit17, Lit18, Lit7);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit46, "Features: ", Lit4);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit46, "Features: ", Lit4);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit46, "- Ramp and lift available", Lit4);
    }

    static Object lambda25() {
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit46, "- Ramp and lift available", Lit4);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit81, Lit46, "-Wheelchairs available", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit17, Lit82, Lit7);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit81, Lit46, "-Wheelchairs available", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit17, Lit82, Lit7);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit5, Lit86, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit46, "Explore  coupons", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit47, Lit87, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit62, Lit88, Lit7);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit5, Lit86, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit46, "Explore  coupons", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit47, Lit87, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit62, Lit88, Lit7);
    }

    public Object Button6$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("i_couons"), Lit90, "open another screen");
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit5, Lit94, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit40, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit41, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit25, Lit95, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit46, "KINGDOM OF DREAMS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit62, Lit96, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit17, Lit18, Lit7);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit5, Lit94, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit40, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit41, Lit42, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit25, Lit95, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit46, "KINGDOM OF DREAMS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit62, Lit96, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit17, Lit18, Lit7);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit5, Lit100, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit46, "Fun filled adventure park with food courts and rides", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit62, Lit101, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit17, Lit18, Lit7);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit5, Lit100, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit46, "Fun filled adventure park with food courts and rides", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit62, Lit101, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit17, Lit18, Lit7);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit5, Lit105, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit17, Lit18, Lit7);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit104, Lit5, Lit105, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit104, Lit17, Lit18, Lit7);
    }

    static Object lambda36() {
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit46, "Features: ", Lit4);
    }

    static Object lambda37() {
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit46, "Features: ", Lit4);
    }

    static Object lambda38() {
        return runtime.setAndCoerceProperty$Ex(Lit111, Lit46, "- Ramp and lift available", Lit4);
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit111, Lit46, "- Ramp and lift available", Lit4);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit46, "-Personnel available", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit17, Lit115, Lit7);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit114, Lit46, "-Personnel available", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit114, Lit17, Lit115, Lit7);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit118, Lit5, Lit119, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit118, Lit46, "Explore  coupons", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit118, Lit47, Lit87, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit118, Lit62, Lit120, Lit7);
    }

    static Object lambda43() {
        runtime.setAndCoerceProperty$Ex(Lit118, Lit5, Lit119, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit118, Lit46, "Explore  coupons", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit118, Lit47, Lit87, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit118, Lit62, Lit120, Lit7);
    }

    public Object Button13$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("p_coupons"), Lit122, "open another screen");
    }

    /* compiled from: malls.yail */
    public class frame extends ModuleBody {
        malls $main;

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof malls)) {
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
                    if (!(obj instanceof malls)) {
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
                    if (!(obj instanceof malls)) {
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
                    if (!(obj instanceof malls)) {
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
                    malls malls = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    malls.dispatchGenericEvent(component, str, z, (Object[]) obj4);
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
                    return malls.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return malls.lambda3();
                case 21:
                    return malls.lambda4();
                case 22:
                    return malls.lambda5();
                case 23:
                    return malls.lambda6();
                case 24:
                    return malls.lambda7();
                case 25:
                    return malls.lambda8();
                case 26:
                    return malls.lambda9();
                case 27:
                    return this.$main.Image2$Click();
                case 28:
                    return malls.lambda10();
                case 29:
                    return malls.lambda11();
                case 30:
                    return malls.lambda12();
                case 31:
                    return malls.lambda13();
                case 32:
                    return malls.lambda14();
                case 33:
                    return malls.lambda15();
                case 34:
                    return malls.lambda16();
                case 35:
                    return malls.lambda17();
                case 36:
                    return malls.lambda18();
                case 37:
                    return malls.lambda19();
                case 38:
                    return malls.lambda20();
                case 39:
                    return malls.lambda21();
                case 40:
                    return malls.lambda22();
                case 41:
                    return malls.lambda23();
                case 42:
                    return malls.lambda24();
                case 43:
                    return malls.lambda25();
                case 44:
                    return malls.lambda26();
                case 45:
                    return malls.lambda27();
                case 46:
                    return malls.lambda28();
                case 47:
                    return malls.lambda29();
                case 48:
                    return this.$main.Button6$Click();
                case 49:
                    return malls.lambda30();
                case 50:
                    return malls.lambda31();
                case 51:
                    return malls.lambda32();
                case 52:
                    return malls.lambda33();
                case 53:
                    return malls.lambda34();
                case 54:
                    return malls.lambda35();
                case 55:
                    return malls.lambda36();
                case 56:
                    return malls.lambda37();
                case 57:
                    return malls.lambda38();
                case 58:
                    return malls.lambda39();
                case 59:
                    return malls.lambda40();
                case 60:
                    return malls.lambda41();
                case 61:
                    return malls.lambda42();
                case 62:
                    return malls.lambda43();
                case 63:
                    return this.$main.Button13$Click();
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
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
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
        malls = this;
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
