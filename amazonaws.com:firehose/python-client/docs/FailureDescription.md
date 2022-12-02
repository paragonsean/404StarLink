# FailureDescription

Provides details in case one of the following operations fails due to an error related to KMS: <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>, <a>StopDeliveryStreamEncryption</a>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**DeliveryStreamFailureType**](DeliveryStreamFailureType.md) |  | 
**details** | **str** |  | 

## Example

```python
from openapi_client.models.failure_description import FailureDescription

# TODO update the JSON string below
json = "{}"
# create an instance of FailureDescription from a JSON string
failure_description_instance = FailureDescription.from_json(json)
# print the JSON string representation of the object
print(FailureDescription.to_json())

# convert the object into a dict
failure_description_dict = failure_description_instance.to_dict()
# create an instance of FailureDescription from a dict
failure_description_from_dict = FailureDescription.from_dict(failure_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


