<h1>Задача</h1>
<p>Написать программу, которая позволяет создавать, изменять, просматривать и удалять текстовые файлы используя интерфейс командной строки.</p>
<p>После запуска программа читает пользовательский ввод из консоли и, если пользователь ввел известную комманду в правильном формате,
то выполняет комманду, если комманда не известна, либо введена в не верном формате, выводит сообщение об ошибке в консоль.</p>

<p>Список и формат комманд:</p>
<ol>
    <li>create [имя файла] - создает файл с указанным именем</li>
    <li>add [имя файла] [текст] - добавляет текс в конец файла с указанным именем</li>
    <li>show [имя файла] - выводит содержимое файла с указанным именем в консоль</li>
    <li>delete [имя файла] - удаляет файл с указанным именем</li>
    <li>exit - программа заканчивает работу</li>
</ol>
<p>Консоль не должна блокироваться во время выполнения комманды.
 Если пользователь ввел несколько комманд подряд, программа гарантирует их выполнение в порядке
ввода.</p>
<p>В программе уже есть главный класс, а также определены и разнесены по пакетам классы, отвечающие за решение основных задач приложения.</p>
<h4>Для выполнения работы</h4>
<h5>Уровень 1</h5>
<p>Наполните классы полями и методами, опишите классы и методы используя комментарии в формате javadoc</p>
<h5>Уровень 2</h5>
<p>Реализовать необходимый функционал.</p>
<h5>Уровень 3</h5>
<p>Добавьте необходимые абстракции (абстрактные классы и интерфейсы), обеспечивающие:</p>
<ul>
    <li>слабое зацепление - слабую взаимозависимость между классами из разных пакетов.</li>
    <li>сильную связанность - методы в одном классе служат решению одной, либо нескольких неразделимых задач.</li>
    <li>открытость для расширения - если нам понадобится добавить новую комманду мы должны иметь возможность сделать это не изменяя уже существующие классы, а только добавив новые.</li>
</ul>