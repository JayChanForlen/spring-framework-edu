**区别主要有以下几个角度：**
<li>作用对象
<ol>BeanPostProcessor主要作用在Bean</ol>
<ol>BeanFactoryPostProcess主要作用在BeanFactory</ol>
</li>
<li>调用阶段
<ol>BeanPostProcessor在 Bean 的初始化前后执行</ol>
<ol>BeanFactoryPostProcessor在容器启动阶段进行操作的</ol>
</li>
<li>主要用途
<ol>
BeanPostProcessor
<ol>修改 Bean 的属性值。</ol>
<ol>验证 Bean 的状态。</ol>
<ol>为 Bean 添加代理。</ol>
<ol>对 Bean 进行其他的定制化处理。</ol>
</ol>
<ol>BeanFactoryPostProcessor
<ol>修改 BeanFactory 的配置信息。</ol>
<ol>注册额外的 Bean 定义。</ol>
<ol>解析占位符属性。</ol>
</ol>
</li>

**相同点**
<br>分别用于对 Bean 的实例化和初始化过程进行定制化处理。