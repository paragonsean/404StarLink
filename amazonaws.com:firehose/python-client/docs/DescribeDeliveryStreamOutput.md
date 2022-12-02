# DescribeDeliveryStreamOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_description** | [**DescribeDeliveryStreamOutputDeliveryStreamDescription**](DescribeDeliveryStreamOutputDeliveryStreamDescription.md) |  | 

## Example

```python
from openapi_client.models.describe_delivery_stream_output import DescribeDeliveryStreamOutput

# TODO update the JSON string below
json = "{}"
# create an instance of DescribeDeliveryStreamOutput from a JSON string
describe_delivery_stream_output_instance = DescribeDeliveryStreamOutput.from_json(json)
# print the JSON string representation of the object
print(DescribeDeliveryStreamOutput.to_json())

# convert the object into a dict
describe_delivery_stream_output_dict = describe_delivery_stream_output_instance.to_dict()
# create an instance of DescribeDeliveryStreamOutput from a dict
describe_delivery_stream_output_from_dict = DescribeDeliveryStreamOutput.from_dict(describe_delivery_stream_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


