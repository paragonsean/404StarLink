# FormTableDefinition

Definition of a form table for OCR data extraction from images

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column_definitions** | [**List[FormTableColumnDefinition]**](FormTableColumnDefinition.md) | Definition of the columns in the table | [optional] 
**table_id** | **str** | Optional; the ID of the table | [optional] 
**target_row_height_relative** | **float** | Optional - scale factor for target row height - relative to height of column header | [optional] 
**target_table_height_relative** | **float** | Optional - scale factor for target table height - relative to maximum height of headers of columns | [optional] 

## Example

```python
from openapi_client.models.form_table_definition import FormTableDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of FormTableDefinition from a JSON string
form_table_definition_instance = FormTableDefinition.from_json(json)
# print the JSON string representation of the object
print(FormTableDefinition.to_json())

# convert the object into a dict
form_table_definition_dict = form_table_definition_instance.to_dict()
# create an instance of FormTableDefinition from a dict
form_table_definition_from_dict = FormTableDefinition.from_dict(form_table_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


