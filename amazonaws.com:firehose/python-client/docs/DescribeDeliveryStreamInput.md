# DescribeDeliveryStreamInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**limit** | **int** |  | [optional] 
**exclusive_start_destination_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.describe_delivery_stream_input import DescribeDeliveryStreamInput

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeDeliveryStreamInput from a JSON string
describe_delivery_stream_input_instance = DescribeDeliveryStreamInput.from_json(json)
# print the JSON string representation of the object
print(DescribeDeliveryStreamInput.to_json())

# convert the object into a dict
describe_delivery_stream_input_dict = describe_delivery_stream_input_instance.to_dict()
# create an instance of DescribeDeliveryStreamInput from a dict
describe_delivery_stream_input_from_dict = DescribeDeliveryStreamInput.from_dict(describe_delivery_stream_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


