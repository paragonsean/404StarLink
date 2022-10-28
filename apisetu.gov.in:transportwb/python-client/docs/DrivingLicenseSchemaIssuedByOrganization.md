# DrivingLicenseSchemaIssuedByOrganization


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**DrivingLicenseSchemaIssuedByOrganizationAddress**](DrivingLicenseSchemaIssuedByOrganizationAddress.md) |  | 
**code** | **str** |  | 
**name** | **str** |  | 
**tin** | **str** |  | 
**type** | **str** |  | 
**uid** | **str** |  | 

## Example

```python
from openapi_client.models.driving_license_schema_issued_by_organization import DrivingLicenseSchemaIssuedByOrganization

# TODO update the JSON string below
json = "{}"
# create an instance of DrivingLicenseSchemaIssuedByOrganization from a JSON string
driving_license_schema_issued_by_organization_instance = DrivingLicenseSchemaIssuedByOrganization.from_json(json)
# print the JSON string representation of the object
print(DrivingLicenseSchemaIssuedByOrganization.to_json())

# convert the object into a dict
driving_license_schema_issued_by_organization_dict = driving_license_schema_issued_by_organization_instance.to_dict()
# create an instance of DrivingLicenseSchemaIssuedByOrganization from a dict
driving_license_schema_issued_by_organization_from_dict = DrivingLicenseSchemaIssuedByOrganization.from_dict(driving_license_schema_issued_by_organization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


