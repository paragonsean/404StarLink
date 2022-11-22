# SidewalkAccountInfoWithFingerprint

Information about a Sidewalk account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** |  | [optional] 
**fingerprint** | **str** |  | [optional] 
**arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_account_info_with_fingerprint import SidewalkAccountInfoWithFingerprint

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkAccountInfoWithFingerprint from a JSON string
sidewalk_account_info_with_fingerprint_instance = SidewalkAccountInfoWithFingerprint.from_json(json)
# print the JSON string representation of the object
print(SidewalkAccountInfoWithFingerprint.to_json())

# convert the object into a dict
sidewalk_account_info_with_fingerprint_dict = sidewalk_account_info_with_fingerprint_instance.to_dict()
# create an instance of SidewalkAccountInfoWithFingerprint from a dict
sidewalk_account_info_with_fingerprint_from_dict = SidewalkAccountInfoWithFingerprint.from_dict(sidewalk_account_info_with_fingerprint_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


