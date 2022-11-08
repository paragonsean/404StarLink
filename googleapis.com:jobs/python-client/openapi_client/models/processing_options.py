# coding: utf-8

"""
    Cloud Talent Solution API

    Cloud Talent Solution provides the capability to create, read, update, and delete job postings, as well as search jobs based on keywords and filters. 

    The version of the OpenAPI document: v3p1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class ProcessingOptions(BaseModel):
    """
    Input only. Options for job processing.
    """ # noqa: E501
    disable_street_address_resolution: Optional[StrictBool] = Field(default=None, description="Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.", alias="disableStreetAddressResolution")
    html_sanitization: Optional[StrictStr] = Field(default=None, description="Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.", alias="htmlSanitization")
    __properties: ClassVar[List[str]] = ["disableStreetAddressResolution", "htmlSanitization"]

    @field_validator('html_sanitization')
    def html_sanitization_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['HTML_SANITIZATION_UNSPECIFIED', 'HTML_SANITIZATION_DISABLED', 'SIMPLE_FORMATTING_ONLY']):
            raise ValueError("must be one of enum values ('HTML_SANITIZATION_UNSPECIFIED', 'HTML_SANITIZATION_DISABLED', 'SIMPLE_FORMATTING_ONLY')")
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
        """Create an instance of ProcessingOptions from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ProcessingOptions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "disableStreetAddressResolution": obj.get("disableStreetAddressResolution"),
            "htmlSanitization": obj.get("htmlSanitization")
        })
        return _obj


