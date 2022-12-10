# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.user_role import UserRole
from typing import Optional, Set
from typing_extensions import Self

class UserInvitationCreateRequestDataAttributes(BaseModel):
    """
    UserInvitationCreateRequestDataAttributes
    """ # noqa: E501
    all_apps_visible: Optional[StrictBool] = Field(default=None, alias="allAppsVisible")
    email: StrictStr
    first_name: StrictStr = Field(alias="firstName")
    last_name: StrictStr = Field(alias="lastName")
    provisioning_allowed: Optional[StrictBool] = Field(default=None, alias="provisioningAllowed")
    roles: List[UserRole]
    __properties: ClassVar[List[str]] = ["allAppsVisible", "email", "firstName", "lastName", "provisioningAllowed", "roles"]

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
        """Create an instance of UserInvitationCreateRequestDataAttributes from a JSON string"""
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
        """Create an instance of UserInvitationCreateRequestDataAttributes from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "allAppsVisible": obj.get("allAppsVisible"),
            "email": obj.get("email"),
            "firstName": obj.get("firstName"),
            "lastName": obj.get("lastName"),
            "provisioningAllowed": obj.get("provisioningAllowed"),
            "roles": obj.get("roles")
        })
        return _obj


