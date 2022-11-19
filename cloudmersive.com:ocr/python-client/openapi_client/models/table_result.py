# coding: utf-8

"""
    ocrapi

    The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.form_table_definition import FormTableDefinition
from openapi_client.models.table_row_result import TableRowResult
from typing import Optional, Set
from typing_extensions import Self

class TableResult(BaseModel):
    """
    The result of reading a table via OCR from a form
    """ # noqa: E501
    table_definition: Optional[FormTableDefinition] = Field(default=None, alias="TableDefinition")
    table_rows_result: Optional[List[TableRowResult]] = Field(default=None, description="Rows of data in the table", alias="TableRowsResult")
    __properties: ClassVar[List[str]] = ["TableDefinition", "TableRowsResult"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of TableResult from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of table_definition
        if self.table_definition:
            _dict['TableDefinition'] = self.table_definition.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in table_rows_result (list)
        _items = []
        if self.table_rows_result:
            for _item_table_rows_result in self.table_rows_result:
                if _item_table_rows_result:
                    _items.append(_item_table_rows_result.to_dict())
            _dict['TableRowsResult'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TableResult from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "TableDefinition": FormTableDefinition.from_dict(obj["TableDefinition"]) if obj.get("TableDefinition") is not None else None,
            "TableRowsResult": [TableRowResult.from_dict(_item) for _item in obj["TableRowsResult"]] if obj.get("TableRowsResult") is not None else None
        })
        return _obj


