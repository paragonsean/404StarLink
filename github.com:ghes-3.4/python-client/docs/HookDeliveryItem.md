# HookDeliveryItem

Delivery made by a webhook, without request and response information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | The type of activity for the event that triggered the delivery. | 
**delivered_at** | **datetime** | Time when the webhook delivery occurred. | 
**duration** | **float** | Time spent delivering. | 
**event** | **str** | The event that triggered the delivery. | 
**guid** | **str** | Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event). | 
**id** | **int** | Unique identifier of the webhook delivery. | 
**installation_id** | **int** | The id of the GitHub App installation associated with this event. | 
**redelivery** | **bool** | Whether the webhook delivery is a redelivery. | 
**repository_id** | **int** | The id of the repository associated with this event. | 
**status** | **str** | Describes the response returned after attempting the delivery. | 
**status_code** | **int** | Status code received when delivery was made. | 

## Example

```python
from openapi_client.models.hook_delivery_item import HookDeliveryItem

# TODO update the JSON string below
json = "{}"
# create an instance of HookDeliveryItem from a JSON string
hook_delivery_item_instance = HookDeliveryItem.from_json(json)
# print the JSON string representation of the object
print(HookDeliveryItem.to_json())

# convert the object into a dict
hook_delivery_item_dict = hook_delivery_item_instance.to_dict()
# create an instance of HookDeliveryItem from a dict
hook_delivery_item_from_dict = HookDeliveryItem.from_dict(hook_delivery_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


