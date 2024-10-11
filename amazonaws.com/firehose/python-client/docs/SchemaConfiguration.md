# SchemaConfiguration

Specifies the schema to which you want Kinesis Data Firehose to configure your data before it writes it to Amazon S3. This parameter is required if <code>Enabled</code> is set to true.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**catalog_id** | **str** |  | [optional] 
**database_name** | **str** |  | [optional] 
**table_name** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**version_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.schema_configuration import SchemaConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of SchemaConfiguration from a JSON string
schema_configuration_instance = SchemaConfiguration.from_json(json)
# print the JSON string representation of the object
print(SchemaConfiguration.to_json())

# convert the object into a dict
schema_configuration_dict = schema_configuration_instance.to_dict()
# create an instance of SchemaConfiguration from a dict
schema_configuration_from_dict = SchemaConfiguration.from_dict(schema_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


