SIMISA@@@@@@@@@@JINX0s1t______

shape (
	shape_header ( 00000000 00000000 )
	volumes ( 1
		vol_sphere (
			vector ( 0.00338189 0.075 0 ) 0.620828
		)
	)
	shader_names ( 1
		named_shader ( BlendATexDiff )
	)
	texture_filter_names ( 1
		named_filter_mode ( MipLinear )
	)
	points ( 8
		point ( -0.137339 0 -0.6 )
		point ( -0.137339 0 0.6 )
		point ( 0.144103 0 0.6 )
		point ( 0.144103 0 -0.6 )
		point ( -0.075 0.15 0.6 )
		point ( 0.075 0.15 0.6 )
		point ( 0.075 0.15 -0.6 )
		point ( -0.075 0.15 -0.6 )
	)
	uv_points ( 4
		uv_point ( 1 0.437523 )
		uv_point ( 0.999997 0.562523 )
		uv_point ( -2.88561e-006 0.562477 )
		uv_point ( 2.9015e-006 0.437477 )
	)
	normals ( 3
		vector ( -0.923428 0.383773 0 )
		vector ( 0.908253 0.418421 0 )
		vector ( 0 1 0 )
	)
	sort_vectors ( 0
	)
	colours ( 0 )
	matrices ( 1
		matrix Box01 ( 1 0 0 0 1 0 0 0 1 0 0 0 )
	)
	images ( 1
		image ( PLANKA.ace )
	)
	textures ( 1
		texture ( 0 0 -5 ff000000 )
	)
	light_materials ( 0 )
	light_model_cfgs ( 1
		light_model_cfg ( 00000000
			uv_ops ( 1
				uv_op_copy ( 1 0 )
			)
		)
	)
	vtx_states ( 1
		vtx_state ( 00000000 0 -5 0 00000002 )
	)
	prim_states ( 1
		prim_state ( 00000000 0
			tex_idxs ( 1 0 ) 0 0 1 0 1
		)
	)
	lod_controls ( 1
		lod_control (
			distance_levels_header ( 0 )
			distance_levels ( 1
				distance_level (
					distance_level_header (
						dlevel_selection ( 300 )
						hierarchy ( 1 -1 )
					)
					sub_objects ( 1
						sub_object (
							sub_object_header ( 00000400 -1 -1 000001d2 000001c4
								geometry_info ( 6 1 0 18 0 0 1 0 0 0
									geometry_nodes ( 1
										geometry_node ( 1 0 0 0 0
											cullable_prims ( 1 6 18 )
										)
									)
									geometry_node_map ( 1 0 )
								)
								subobject_shaders ( 1 0 )
								subobject_light_cfgs ( 1 0 ) 1
							)
							vertices ( 12
								vertex ( 00000000 4 0 ffffffff ff000000
									vertex_uvs ( 1 0 )
								)
								vertex ( 00000000 7 0 ffffffff ff000000
									vertex_uvs ( 1 3 )
								)
								vertex ( 00000000 0 0 ffffffff ff000000
									vertex_uvs ( 1 3 )
								)
								vertex ( 00000000 1 0 ffffffff ff000000
									vertex_uvs ( 1 0 )
								)
								vertex ( 00000000 6 1 ffffffff ff000000
									vertex_uvs ( 1 2 )
								)
								vertex ( 00000000 5 1 ffffffff ff000000
									vertex_uvs ( 1 1 )
								)
								vertex ( 00000000 2 1 ffffffff ff000000
									vertex_uvs ( 1 1 )
								)
								vertex ( 00000000 3 1 ffffffff ff000000
									vertex_uvs ( 1 2 )
								)
								vertex ( 00000000 4 2 ffffffff ff000000
									vertex_uvs ( 1 0 )
								)
								vertex ( 00000000 5 2 ffffffff ff000000
									vertex_uvs ( 1 1 )
								)
								vertex ( 00000000 6 2 ffffffff ff000000
									vertex_uvs ( 1 2 )
								)
								vertex ( 00000000 7 2 ffffffff ff000000
									vertex_uvs ( 1 3 )
								)
							)
							vertex_sets ( 1
								vertex_set ( 0 0 12 )
							)
							primitives ( 2
								prim_state_idx ( 0 )
								indexed_trilist (
									vertex_idxs ( 18 1 3 0 3 1 2 5 7 4 7 5 6 9 11 8 11 9 10 )
									normal_idxs ( 6 0 3 0 3 1 3 1 3 2 3 2 3 )
									flags ( 6 00000000 00000000 00000000 00000000 00000000 00000000 )
								)
							)
						)
					)
				)
			)
		)
	)
)
