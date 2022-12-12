# ShareProfileResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acknowledgement** | [**ShareProfileAcknowledgement**](ShareProfileAcknowledgement.md) |  | 
**error** | [**Error**](Error.md) |  | [optional] 
**request_id** | **str** | a nonce, unique for each HTTP request | 
**resp** | [**RequestReference**](RequestReference.md) |  | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 

## Example

```python
from openapi_client.models.share_profile_result import ShareProfileResult

# TODO update the JSON string below
json = "{}"
# create an instance of ShareProfileResult from a JSON string
share_profile_result_instance = ShareProfileResult.from_json(json)
# print the JSON string representation of the object
print(ShareProfileResult.to_json())

# convert the object into a dict
share_profile_result_dict = share_profile_result_instance.to_dict()
# create an instance of ShareProfileResult from a dict
share_profile_result_from_dict = ShareProfileResult.from_dict(share_profile_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


