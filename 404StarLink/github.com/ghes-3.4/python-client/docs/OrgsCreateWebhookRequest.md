# OrgsCreateWebhookRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** | Determines if notifications are sent when the webhook is triggered. Set to &#x60;true&#x60; to send notifications. | [optional] [default to True]
**config** | [**OrgsCreateWebhookRequestConfig**](OrgsCreateWebhookRequestConfig.md) |  | 
**events** | **List[str]** | Determines what [events](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads) the hook is triggered for. Set to &#x60;[\&quot;*\&quot;]&#x60; to receive all possible events. | [optional] [default to ["push"]]
**name** | **str** | Must be passed as \&quot;web\&quot;. | 

## Example

```python
from openapi_client.models.orgs_create_webhook_request import OrgsCreateWebhookRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OrgsCreateWebhookRequest from a JSON string
orgs_create_webhook_request_instance = OrgsCreateWebhookRequest.from_json(json)
# print the JSON string representation of the object
print(OrgsCreateWebhookRequest.to_json())

# convert the object into a dict
orgs_create_webhook_request_dict = orgs_create_webhook_request_instance.to_dict()
# create an instance of OrgsCreateWebhookRequest from a dict
orgs_create_webhook_request_from_dict = OrgsCreateWebhookRequest.from_dict(orgs_create_webhook_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


