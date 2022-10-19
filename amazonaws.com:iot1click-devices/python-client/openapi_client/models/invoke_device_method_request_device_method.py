# coding: utf-8

"""
    AWS IoT 1-Click Devices Service

    Describes all of the AWS IoT 1-Click device-related API operations for the service.  Also provides sample requests, responses, and errors for the supported web services  protocols.

    The version of the OpenAPI document: 2018-05-14
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class InvokeDeviceMethodRequestDeviceMethod(BaseModel):
    """
    InvokeDeviceMethodRequestDeviceMethod
    """ # noqa: E501
    device_type: Optional[Any] = Field(default=None, alias="DeviceType")
    method_name: Optional[Any] = Field(default=None, alias="MethodName")
    __properties: ClassVar[List[str]] = ["DeviceType", "MethodName"]

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
        """Create an instance of InvokeDeviceMethodRequestDeviceMethod from a JSON string"""
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
        """Create an instance of InvokeDeviceMethodRequestDeviceMethod from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "DeviceType": obj.get("DeviceType"),
            "MethodName": obj.get("MethodName")
        })
        return _obj


