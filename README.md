# Music Button Block

> 禁用 SystemUI 媒体控件中丑陋、容易误触的自定义按钮，还你干净的播放器控件。

## 这是什么

MIUI / HyperOS 的通知栏和媒体岛播放器有 5 个按钮位，其中两侧的 **自定义按钮** 来自音乐 App 的 `MediaSession`。这些按钮：

- 样式丑陋，破坏播放器整体观感
- 容易误触，一不小心就跳转到 App 内页面
- 不是你想要的功能，却占着最显眼的位置

**本模块帮你干掉它们。**

## 效果

**Before**：`[自定义] [上一曲] [播放/暂停] [下一曲] [自定义]`

**After**：`[上一曲] [播放/暂停] [下一曲]`

只保留你真正需要的三个按钮。

## 默认支持

| 应用 | 包名 |
|------|------|
| 网易云音乐 | `com.netease.cloudmusic` |
| QQ 音乐 | `com.tencent.qqmusic` |

## 环境要求

- **LSPosed**（官方发行版本）
- **Android 15+**（SDK 35+）
- 作用域：`com.android.systemui`

## 使用

1. 安装 APK
2. LSPosed 中启用模块，勾选作用域 `com.android.systemui`
3. 重启设备
4. 播放音乐，享受干净的播放器控件

## 验证

```bash
adb logcat -s MusicButtonBlock
```

## 构建

```bash
./gradlew :app:assembleRelease
```

## 许可

仅供个人学习与研究使用。
