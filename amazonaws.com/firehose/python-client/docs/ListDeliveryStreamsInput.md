# ListDeliveryStreamsInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** |  | [optional] 
**delivery_stream_type** | [**DeliveryStreamType**](DeliveryStreamType.md) |  | [optional] 
**exclusive_start_delivery_stream_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_delivery_streams_input import ListDeliveryStreamsInput

# TODO update the JSON string below
json = "{}"
# create an instance of ListDeliveryStreamsInput from a JSON string
list_delivery_streams_input_instance = ListDeliveryStreamsInput.from_json(json)
# print the JSON string representation of the object
print(ListDeliveryStreamsInput.to_json())

# convert the object into a dict
list_delivery_streams_input_dict = list_delivery_streams_input_instance.to_dict()
# create an instance of ListDeliveryStreamsInput from a dict
list_delivery_streams_input_from_dict = ListDeliveryStreamsInput.from_dict(list_delivery_streams_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


