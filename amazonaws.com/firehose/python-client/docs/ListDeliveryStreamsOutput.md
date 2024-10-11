# ListDeliveryStreamsOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_names** | **List** |  | 
**has_more_delivery_streams** | **bool** |  | 

## Example

```python
from openapi_client.models.list_delivery_streams_output import ListDeliveryStreamsOutput

# TODO update the JSON string below
json = "{}"
# create an instance of ListDeliveryStreamsOutput from a JSON string
list_delivery_streams_output_instance = ListDeliveryStreamsOutput.from_json(json)
# print the JSON string representation of the object
print(ListDeliveryStreamsOutput.to_json())

# convert the object into a dict
list_delivery_streams_output_dict = list_delivery_streams_output_instance.to_dict()
# create an instance of ListDeliveryStreamsOutput from a dict
list_delivery_streams_output_from_dict = ListDeliveryStreamsOutput.from_dict(list_delivery_streams_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


