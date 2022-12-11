# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import date
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.user_update_content_all_of_notifications import UserUpdateContentAllOfNotifications
from typing import Optional, Set
from typing_extensions import Self

class UserUpdateContent(BaseModel):
    """
    UserUpdateContent
    """ # noqa: E501
    city: Optional[StrictStr] = None
    country: Optional[StrictStr] = None
    phone: Optional[StrictStr] = None
    state: Optional[StrictStr] = None
    street: Optional[StrictStr] = None
    zip: Optional[StrictStr] = None
    birthday: Optional[date] = None
    email: Optional[StrictStr] = Field(default=None, description="Optional. User e-mail.")
    first_name: Optional[StrictStr] = Field(default=None, description="Optional. User first name.")
    id: Optional[StrictInt] = Field(default=None, description="Optional. ID of the user being updated.")
    last_name: Optional[StrictStr] = Field(default=None, description="Optional. User last name.")
    notifications: Optional[UserUpdateContentAllOfNotifications] = None
    notify: Optional[StrictBool] = Field(default=None, description="Notify new user account creation with login information and MotaWord introduction.")
    paypal_email: Optional[StrictStr] = Field(default=None, description="Optional. Vendor paypal e-mail")
    require_1099: Optional[StrictBool] = Field(default=None, description="Optional. Whether this vendor requires 1099 form in US for their earnings.")
    user_groups: Optional[List[StrictInt]] = Field(default=None, description="A list of user group IDs")
    __properties: ClassVar[List[str]] = ["city", "country", "phone", "state", "street", "zip", "birthday", "email", "first_name", "id", "last_name", "notifications", "notify", "paypal_email", "require_1099", "user_groups"]

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
        """Create an instance of UserUpdateContent from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of notifications
        if self.notifications:
            _dict['notifications'] = self.notifications.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UserUpdateContent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "city": obj.get("city"),
            "country": obj.get("country"),
            "phone": obj.get("phone"),
            "state": obj.get("state"),
            "street": obj.get("street"),
            "zip": obj.get("zip"),
            "birthday": obj.get("birthday"),
            "email": obj.get("email"),
            "first_name": obj.get("first_name"),
            "id": obj.get("id"),
            "last_name": obj.get("last_name"),
            "notifications": UserUpdateContentAllOfNotifications.from_dict(obj["notifications"]) if obj.get("notifications") is not None else None,
            "notify": obj.get("notify"),
            "paypal_email": obj.get("paypal_email"),
            "require_1099": obj.get("require_1099"),
            "user_groups": obj.get("user_groups")
        })
        return _obj


