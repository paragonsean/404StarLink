# UserVendor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_work_manual_files** | **bool** |  | [optional] 
**email_open_rate** | **float** |  | [optional] 
**is_frozen** | **bool** |  | [optional] 
**is_proofreader** | **bool** |  | [optional] 
**language_pairs** | [**List[LanguagePair]**](LanguagePair.md) |  | [optional] 
**native_language** | **str** | Native language of user | [optional] 
**pam_tqs** | **float** |  | [optional] 
**paypal_email** | **str** |  | [optional] 
**profile_survey** | [**ProfileSurvey**](.md) |  | [optional] 
**require_1099** | **bool** |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**tms_user_name** | **str** |  | [optional] 
**vendor_type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.user_vendor import UserVendor

# TODO update the JSON string below
json = "{}"
# create an instance of UserVendor from a JSON string
user_vendor_instance = UserVendor.from_json(json)
# print the JSON string representation of the object
print(UserVendor.to_json())

# convert the object into a dict
user_vendor_dict = user_vendor_instance.to_dict()
# create an instance of UserVendor from a dict
user_vendor_from_dict = UserVendor.from_dict(user_vendor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


