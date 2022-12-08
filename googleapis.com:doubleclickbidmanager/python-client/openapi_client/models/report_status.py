# coding: utf-8

"""
    DoubleClick Bid Manager API

    DoubleClick Bid Manager API allows users to manage and create campaigns and reports.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class ReportStatus(BaseModel):
    """
    Report status.
    """ # noqa: E501
    finish_time: Optional[StrictStr] = Field(default=None, description="Output only. The time when this report either completed successfully or failed.", alias="finishTime")
    format: Optional[StrictStr] = Field(default=None, description="The file type of the report.")
    state: Optional[StrictStr] = Field(default=None, description="Output only. The state of the report.")
    __properties: ClassVar[List[str]] = ["finishTime", "format", "state"]

    @field_validator('format')
    def format_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['FORMAT_UNSPECIFIED', 'CSV', 'XLSX']):
            raise ValueError("must be one of enum values ('FORMAT_UNSPECIFIED', 'CSV', 'XLSX')")
        return value

    @field_validator('state')
    def state_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['STATE_UNSPECIFIED', 'QUEUED', 'RUNNING', 'DONE', 'FAILED']):
            raise ValueError("must be one of enum values ('STATE_UNSPECIFIED', 'QUEUED', 'RUNNING', 'DONE', 'FAILED')")
        return value

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
        """Create an instance of ReportStatus from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "finish_time",
            "state",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReportStatus from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "finishTime": obj.get("finishTime"),
            "format": obj.get("format"),
            "state": obj.get("state")
        })
        return _obj


