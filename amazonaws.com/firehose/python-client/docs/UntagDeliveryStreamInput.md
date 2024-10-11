# UntagDeliveryStreamInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**tag_keys** | **List** |  | 

## Example

```python
from openapi_client.models.untag_delivery_stream_input import UntagDeliveryStreamInput

# TODO update the JSON string below
json = "{}"
# create an instance of UntagDeliveryStreamInput from a JSON string
untag_delivery_stream_input_instance = UntagDeliveryStreamInput.from_json(json)
# print the JSON string representation of the object
print(UntagDeliveryStreamInput.to_json())

# convert the object into a dict
untag_delivery_stream_input_dict = untag_delivery_stream_input_instance.to_dict()
# create an instance of UntagDeliveryStreamInput from a dict
untag_delivery_stream_input_from_dict = UntagDeliveryStreamInput.from_dict(untag_delivery_stream_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


