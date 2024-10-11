# DeleteDeliveryStreamInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**allow_force_delete** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.delete_delivery_stream_input import DeleteDeliveryStreamInput

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteDeliveryStreamInput from a JSON string
delete_delivery_stream_input_instance = DeleteDeliveryStreamInput.from_json(json)
# print the JSON string representation of the object
print(DeleteDeliveryStreamInput.to_json())

# convert the object into a dict
delete_delivery_stream_input_dict = delete_delivery_stream_input_instance.to_dict()
# create an instance of DeleteDeliveryStreamInput from a dict
delete_delivery_stream_input_from_dict = DeleteDeliveryStreamInput.from_dict(delete_delivery_stream_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


