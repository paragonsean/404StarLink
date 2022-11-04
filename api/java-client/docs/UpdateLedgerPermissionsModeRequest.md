

# UpdateLedgerPermissionsModeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permissionsMode** | [**PermissionsModeEnum**](#PermissionsModeEnum) | &lt;p&gt;The permissions mode to assign to the ledger. This parameter can have one of the following values:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;ALLOW_ALL&lt;/code&gt;: A legacy permissions mode that enables access control with API-level granularity for ledgers.&lt;/p&gt; &lt;p&gt;This mode allows users who have the &lt;code&gt;SendCommand&lt;/code&gt; API permission for this ledger to run all PartiQL commands (hence, &lt;code&gt;ALLOW_ALL&lt;/code&gt;) on any tables in the specified ledger. This mode disregards any table-level or command-level IAM permissions policies that you create for the ledger.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;STANDARD&lt;/code&gt;: (&lt;i&gt;Recommended&lt;/i&gt;) A permissions mode that enables access control with finer granularity for ledgers, tables, and PartiQL commands.&lt;/p&gt; &lt;p&gt;By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL actions, in addition to the &lt;code&gt;SendCommand&lt;/code&gt; API permission for the ledger. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html\&quot;&gt;Getting started with the standard permissions mode&lt;/a&gt; in the &lt;i&gt;Amazon QLDB Developer Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;We strongly recommend using the &lt;code&gt;STANDARD&lt;/code&gt; permissions mode to maximize the security of your ledger data.&lt;/p&gt; &lt;/note&gt; |  |



## Enum: PermissionsModeEnum

| Name | Value |
|---- | -----|
| ALLOW_ALL | &quot;ALLOW_ALL&quot; |
| STANDARD | &quot;STANDARD&quot; |



