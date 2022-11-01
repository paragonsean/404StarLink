# EnterpriseSettingsEnterpriseCustomer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**public_key_data** | **str** |  | [optional] 
**secret_key_data** | **str** |  | [optional] 
**uuid** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_customer import EnterpriseSettingsEnterpriseCustomer

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseCustomer from a JSON string
enterprise_settings_enterprise_customer_instance = EnterpriseSettingsEnterpriseCustomer.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseCustomer.to_json())

# convert the object into a dict
enterprise_settings_enterprise_customer_dict = enterprise_settings_enterprise_customer_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseCustomer from a dict
enterprise_settings_enterprise_customer_from_dict = EnterpriseSettingsEnterpriseCustomer.from_dict(enterprise_settings_enterprise_customer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


