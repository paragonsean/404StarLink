# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from openapi_client.models.content_directory_inner import ContentDirectoryInner
from openapi_client.models.content_file import ContentFile
from openapi_client.models.content_submodule import ContentSubmodule
from openapi_client.models.content_symlink import ContentSymlink
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

REPOSGETCONTENT200RESPONSE_ONE_OF_SCHEMAS = ["ContentFile", "ContentSubmodule", "ContentSymlink", "List[ContentDirectoryInner]"]

class ReposGetContent200Response(BaseModel):
    """
    ReposGetContent200Response
    """
    # data type: List[ContentDirectoryInner]
    oneof_schema_1_validator: Optional[List[ContentDirectoryInner]] = Field(default=None, description="A list of directory items")
    # data type: ContentFile
    oneof_schema_2_validator: Optional[ContentFile] = None
    # data type: ContentSymlink
    oneof_schema_3_validator: Optional[ContentSymlink] = None
    # data type: ContentSubmodule
    oneof_schema_4_validator: Optional[ContentSubmodule] = None
    actual_instance: Optional[Union[ContentFile, ContentSubmodule, ContentSymlink, List[ContentDirectoryInner]]] = None
    one_of_schemas: Set[str] = { "ContentFile", "ContentSubmodule", "ContentSymlink", "List[ContentDirectoryInner]" }

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
        instance = ReposGetContent200Response.model_construct()
        error_messages = []
        match = 0
        # validate data type: List[ContentDirectoryInner]
        try:
            instance.oneof_schema_1_validator = v
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # validate data type: ContentFile
        if not isinstance(v, ContentFile):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ContentFile`")
        else:
            match += 1
        # validate data type: ContentSymlink
        if not isinstance(v, ContentSymlink):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ContentSymlink`")
        else:
            match += 1
        # validate data type: ContentSubmodule
        if not isinstance(v, ContentSubmodule):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ContentSubmodule`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in ReposGetContent200Response with oneOf schemas: ContentFile, ContentSubmodule, ContentSymlink, List[ContentDirectoryInner]. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in ReposGetContent200Response with oneOf schemas: ContentFile, ContentSubmodule, ContentSymlink, List[ContentDirectoryInner]. Details: " + ", ".join(error_messages))
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

        # deserialize data into List[ContentDirectoryInner]
        try:
            # validation
            instance.oneof_schema_1_validator = json.loads(json_str)
            # assign value to actual_instance
            instance.actual_instance = instance.oneof_schema_1_validator
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ContentFile
        try:
            instance.actual_instance = ContentFile.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ContentSymlink
        try:
            instance.actual_instance = ContentSymlink.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ContentSubmodule
        try:
            instance.actual_instance = ContentSubmodule.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into ReposGetContent200Response with oneOf schemas: ContentFile, ContentSubmodule, ContentSymlink, List[ContentDirectoryInner]. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into ReposGetContent200Response with oneOf schemas: ContentFile, ContentSubmodule, ContentSymlink, List[ContentDirectoryInner]. Details: " + ", ".join(error_messages))
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

    def to_dict(self) -> Optional[Union[Dict[str, Any], ContentFile, ContentSubmodule, ContentSymlink, List[ContentDirectoryInner]]]:
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


