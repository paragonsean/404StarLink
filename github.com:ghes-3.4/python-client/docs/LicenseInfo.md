# LicenseInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days_until_expiration** | **int** |  | [optional] 
**expire_at** | **str** |  | [optional] 
**kind** | **str** |  | [optional] 
**seats** | [**LicenseInfoSeats**](LicenseInfoSeats.md) |  | [optional] 
**seats_available** | [**LicenseInfoSeats**](LicenseInfoSeats.md) |  | [optional] 
**seats_used** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.license_info import LicenseInfo

# TODO update the JSON string below
json = "{}"
# create an instance of LicenseInfo from a JSON string
license_info_instance = LicenseInfo.from_json(json)
# print the JSON string representation of the object
print(LicenseInfo.to_json())

# convert the object into a dict
license_info_dict = license_info_instance.to_dict()
# create an instance of LicenseInfo from a dict
license_info_from_dict = LicenseInfo.from_dict(license_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


