# EnterpriseAdminUpdateGlobalWebhookRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | Determines if notifications are sent when the webhook is triggered. Set to &#x60;true&#x60; to send notifications. | [optional] [default to True]
**config** | [**EnterpriseAdminCreateGlobalWebhookRequestConfig**](EnterpriseAdminCreateGlobalWebhookRequestConfig.md) |  | [optional] 
**events** | **List[str]** | The [events](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads) that trigger this webhook. A global webhook can be triggered by &#x60;user&#x60; and &#x60;organization&#x60; events. Default: &#x60;user&#x60; and &#x60;organization&#x60;. | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_update_global_webhook_request import EnterpriseAdminUpdateGlobalWebhookRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminUpdateGlobalWebhookRequest from a JSON string
enterprise_admin_update_global_webhook_request_instance = EnterpriseAdminUpdateGlobalWebhookRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminUpdateGlobalWebhookRequest.to_json())

# convert the object into a dict
enterprise_admin_update_global_webhook_request_dict = enterprise_admin_update_global_webhook_request_instance.to_dict()
# create an instance of EnterpriseAdminUpdateGlobalWebhookRequest from a dict
enterprise_admin_update_global_webhook_request_from_dict = EnterpriseAdminUpdateGlobalWebhookRequest.from_dict(enterprise_admin_update_global_webhook_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


