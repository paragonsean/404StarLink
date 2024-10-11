# HookDelivery

Delivery made by a webhook.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The type of activity for the event that triggered the delivery. | 
**delivered_at** | **datetime** | Time when the delivery was delivered. | 
**duration** | **float** | Time spent delivering. | 
**event** | **str** | The event that triggered the delivery. | 
**guid** | **str** | Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event). | 
**id** | **int** | Unique identifier of the delivery. | 
**installation_id** | **int** | The id of the GitHub App installation associated with this event. | 
**redelivery** | **bool** | Whether the delivery is a redelivery. | 
**repository_id** | **int** | The id of the repository associated with this event. | 
**request** | [**HookDeliveryRequest**](HookDeliveryRequest.md) |  | 
**response** | [**HookDeliveryResponse**](HookDeliveryResponse.md) |  | 
**status** | **str** | Description of the status of the attempted delivery | 
**status_code** | **int** | Status code received when delivery was made. | 
**url** | **str** | The URL target of the delivery. | [optional] 

## Example

```python
from openapi_client.models.hook_delivery import HookDelivery

# TODO update the JSON string below
json = "{}"
# create an instance of HookDelivery from a JSON string
hook_delivery_instance = HookDelivery.from_json(json)
# print the JSON string representation of the object
print(HookDelivery.to_json())

# convert the object into a dict
hook_delivery_dict = hook_delivery_instance.to_dict()
# create an instance of HookDelivery from a dict
hook_delivery_from_dict = HookDelivery.from_dict(hook_delivery_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


