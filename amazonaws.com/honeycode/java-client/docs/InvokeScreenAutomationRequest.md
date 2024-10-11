

# InvokeScreenAutomationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**variables** | [**Map&lt;String, VariableValue&gt;**](VariableValue.md) |  Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is an object which currently has only one property, rawValue, which holds the value of the variable to be passed to the screen. Any variables defined in a screen are required to be passed in the call.  |  [optional] |
|**rowId** | **String** |  The row ID for the automation if the automation is defined inside a block with source or list.  |  [optional] |
|**clientRequestToken** | **String** | &lt;p&gt; The request token for performing the automation action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will return the response of the previous call rather than performing the action again. &lt;/p&gt; &lt;p&gt; Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. &lt;/p&gt; |  [optional] |



