# DrivingLicenseSchema


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_data** | [**DrivingLicenseSchemaCertificateData**](DrivingLicenseSchemaCertificateData.md) |  | 
**issued_by** | [**DrivingLicenseSchemaIssuedBy**](DrivingLicenseSchemaIssuedBy.md) |  | 
**issued_to** | [**DrivingLicenseSchemaIssuedTo**](DrivingLicenseSchemaIssuedTo.md) |  | 
**expiry_date** | **str** |  | [optional] 
**issue_date** | **str** |  | 
**issued_at** | **str** |  | 
**language** | **str** |  | 
**name** | **str** |  | 
**number** | **int** |  | 
**prev_number** | **int** |  | [optional] 
**status** | **str** |  | 
**type** | **str** |  | 
**valid_from_date** | **str** |  | 

## Example

```python
from openapi_client.models.driving_license_schema import DrivingLicenseSchema

# TODO update the JSON string below
json = "{}"
# create an instance of DrivingLicenseSchema from a JSON string
driving_license_schema_instance = DrivingLicenseSchema.from_json(json)
# print the JSON string representation of the object
print(DrivingLicenseSchema.to_json())

# convert the object into a dict
driving_license_schema_dict = driving_license_schema_instance.to_dict()
# create an instance of DrivingLicenseSchema from a dict
driving_license_schema_from_dict = DrivingLicenseSchema.from_dict(driving_license_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


