# EndpointMessageResult

Provides information about the delivery status and results of sending a message directly to an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** |  | [optional] 
**delivery_status** | [**DeliveryStatus**](DeliveryStatus.md) |  | 
**message_id** | **str** |  | [optional] 
**status_code** | **int** |  | 
**status_message** | **str** |  | [optional] 
**updated_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_message_result import EndpointMessageResult

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointMessageResult from a JSON string
endpoint_message_result_instance = EndpointMessageResult.from_json(json)
# print the JSON string representation of the object
print(EndpointMessageResult.to_json())

# convert the object into a dict
endpoint_message_result_dict = endpoint_message_result_instance.to_dict()
# create an instance of EndpointMessageResult from a dict
endpoint_message_result_from_dict = EndpointMessageResult.from_dict(endpoint_message_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


