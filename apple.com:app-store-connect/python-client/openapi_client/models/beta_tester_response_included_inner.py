# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from openapi_client.models.app import App
from openapi_client.models.beta_group import BetaGroup
from openapi_client.models.build import Build
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

BETATESTERRESPONSEINCLUDEDINNER_ONE_OF_SCHEMAS = ["App", "BetaGroup", "Build"]

class BetaTesterResponseIncludedInner(BaseModel):
    """
    BetaTesterResponseIncludedInner
    """
    # data type: App
    oneof_schema_1_validator: Optional[App] = None
    # data type: BetaGroup
    oneof_schema_2_validator: Optional[BetaGroup] = None
    # data type: Build
    oneof_schema_3_validator: Optional[Build] = None
    actual_instance: Optional[Union[App, BetaGroup, Build]] = None
    one_of_schemas: Set[str] = { "App", "BetaGroup", "Build" }

    model_config = ConfigDict(
        validate_assignment=True,
        protected_namespaces=(),
    )


    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @field_validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = BetaTesterResponseIncludedInner.model_construct()
        error_messages = []
        match = 0
        # validate data type: App
        if not isinstance(v, App):
            error_messages.append(f"Error! Input type `{type(v)}` is not `App`")
        else:
            match += 1
        # validate data type: BetaGroup
        if not isinstance(v, BetaGroup):
            error_messages.append(f"Error! Input type `{type(v)}` is not `BetaGroup`")
        else:
            match += 1
        # validate data type: Build
        if not isinstance(v, Build):
            error_messages.append(f"Error! Input type `{type(v)}` is not `Build`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in BetaTesterResponseIncludedInner with oneOf schemas: App, BetaGroup, Build. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in BetaTesterResponseIncludedInner with oneOf schemas: App, BetaGroup, Build. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: Union[str, Dict[str, Any]]) -> Self:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Returns the object represented by the json string"""
        instance = cls.model_construct()
        error_messages = []
        match = 0

        # deserialize data into App
        try:
            instance.actual_instance = App.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into BetaGroup
        try:
            instance.actual_instance = BetaGroup.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into Build
        try:
            instance.actual_instance = Build.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into BetaTesterResponseIncludedInner with oneOf schemas: App, BetaGroup, Build. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into BetaTesterResponseIncludedInner with oneOf schemas: App, BetaGroup, Build. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        if hasattr(self.actual_instance, "to_json") and callable(self.actual_instance.to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> Optional[Union[Dict[str, Any], App, BetaGroup, Build]]:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        if hasattr(self.actual_instance, "to_dict") and callable(self.actual_instance.to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.model_dump())


