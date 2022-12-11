# User


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billing** | [**BillingAddress**](BillingAddress.md) |  | [optional] 
**birthday** | **date** |  | [optional] 
**can_work_manual_files** | **bool** | \\@deprecated. use &#x60;vendor&#x60; key | [optional] 
**city** | **str** | \\@deprecated. use mailing or billing key. | [optional] 
**client** | [**UserClient**](UserClient.md) |  | [optional] 
**corporate_id** | **int** |  | [optional] 
**country** | **str** | \\@deprecated. use mailing or billing key. | [optional] 
**created_at** | **int** | Unix epoch time | [optional] 
**do_not_contact** | **bool** |  | [optional] 
**email** | **str** |  | [optional] 
**first_name** | **str** |  | [optional] 
**has_pwd** | **bool** |  | [optional] 
**id** | **int** |  | [optional] 
**is_client** | **bool** |  | [optional] 
**is_developer** | **bool** |  | [optional] 
**is_proofreader** | **bool** | \\@deprecated. use &#x60;vendor&#x60; key | [optional] 
**is_prospect** | **bool** |  | [optional] 
**is_sales_person** | **bool** |  | [optional] 
**is_vendor** | **bool** |  | [optional] 
**language_pairs** | [**List[LanguagePair]**](LanguagePair.md) | \\@deprecated. use &#x60;vendor&#x60; key | [optional] 
**last_name** | **str** |  | [optional] 
**last_seen_online_at** | **int** | Unix epoch time | [optional] 
**links** | [**UserLinks**](UserLinks.md) |  | [optional] 
**locale** | **str** | User Locale | [optional] 
**mailing** | [**Address**](Address.md) |  | [optional] 
**name** | **str** |  | [optional] 
**native_language** | **str** | \\@deprecated. Native language of user | [optional] 
**nps** | **float** | \\@deprecated. use /stats endpoint for the current nps value. | [optional] 
**phone_number** | **str** |  | [optional] 
**profile_picture_path** | **str** |  | [optional] 
**social_media** | [**SocialMedia**](SocialMedia.md) |  | [optional] 
**state** | **str** | \\@deprecated. use mailing or billing key. | [optional] 
**status** | **str** |  | [optional] 
**street** | **str** | \\@deprecated. use mailing or billing key. | [optional] 
**timezone** | **str** |  | [optional] 
**tms_user_name** | **str** | \\@deprecated. use &#x60;vendor&#x60; key | [optional] 
**user_groups** | [**List[UserGroup]**](UserGroup.md) |  | [optional] 
**vendor** | [**UserVendor**](UserVendor.md) |  | [optional] 
**zip_code** | **str** | \\@deprecated. use mailing or billing key. new key name is \&quot;zip\&quot;. | [optional] 

## Example

```python
from openapi_client.models.user import User

# TODO update the JSON string below
json = "{}"
# create an instance of User from a JSON string
user_instance = User.from_json(json)
# print the JSON string representation of the object
print(User.to_json())

# convert the object into a dict
user_dict = user_instance.to_dict()
# create an instance of User from a dict
user_from_dict = User.from_dict(user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


